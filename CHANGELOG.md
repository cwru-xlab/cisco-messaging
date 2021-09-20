# Change Log

## __0.1.8__

### New Features

- None

### Enhancements

- Add javadoc and sources build artifacts to support viewing documentation in an IDE.

### Bug Fixes

- None

## __0.1.7__

### New Features

- None

### Enhancements

- Support JSON serialization and deserialization of `DefaultMessage`.

### Bug Fixes

- None

## __0.1.6__

### New Features

- None

### Enhancements

- None

### Bug Fixes

- Revert credentials environment variables `GITHUB_ACTOR` and `GITHUB_TOKEN` to `USERNAME` and
  `TOKEN` as these are their names in the `gradle-publish.yml` workflow. This is an attempt to
  resolve `gradle-publish` workflow failures.

## __0.1.5__

### New Features

- None

### Enhancements

- Allow both local credentials (`gpr.user` and `gpr.key`) or remote credentials (`GITHUB_ACTOR`
  and `GITHUB_TOKEN`) to publish packages.

### Bug Fixes

- Expose generated implementation of `DefaultMessage` to access builder.

## __0.1.4__

### New Features

- None

### Enhancements

- Remove redundant "cirrus" from `artifactId`.

### Bug Fixes

- None

## __0.1.3__

### New Features

- None

### Enhancements

- None

### Bug Fixes

- Remove `*.jar` from `.gitignore` and add `gradle-wrapper.jar`.

## __0.1.2__

### New Features

- None

### Enhancements

- Add Gradle wrapper validation to the `gradle-publish` workflow.

### Bug Fixes

- Rename group `org.cirrus` from `org.cirrus.messaging.core`.
- Explicitly specify `groupId`, `artifactId`, and `version` in `publications` section
  of `build.gradle`.

## __0.1.1__

### New Features

- None

### Enhancements

- None

### Bug Fixes

- Replace `username` and `variable` environment variables in `build.gradle`. No package was produced
  from release 0.1.0 which may have been caused by incorrect environment variables.

## __0.1.0__

### New Features

- Initial release

### Enhancements

- None

### Bug Fixes

- None
