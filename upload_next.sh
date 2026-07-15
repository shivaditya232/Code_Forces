#!/bin/bash
# Uploads the oldest not-yet-uploaded problem folder to GitHub.
# Run this once per solved problem — it picks the next one automatically.

set -e
cd "$(dirname "$0")"

NEXT=$(git status --porcelain \
  | awk '/^\?\? / {print $2}' \
  | sed 's#/$##' \
  | grep -Ev '^\.|^cmake-build-debug$' \
  | while read -r d; do
      echo "$(stat -f '%m' "$d") $d"
    done \
  | sort -n \
  | head -1 \
  | cut -d' ' -f2-)

if [ -z "$NEXT" ]; then
  echo "Nothing new to upload — you're all caught up."
  exit 0
fi

echo "Uploading: $NEXT"

git pull origin main
git add "$NEXT"
git commit -m "Add ${NEXT//_/ } solution"
git push origin main

echo "Done. $NEXT is live on GitHub."
