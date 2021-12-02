package subProj_1915

import subProj_1915.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1915")
    name = "subProj 1915"

    buildType(subProj_bt_1915_0)
    buildType(subProj_bt_1915_1)
    buildType(subProj_bt_1915_4)
    buildType(subProj_bt_1915_5)
    buildType(subProj_bt_1915_2)
    buildType(subProj_bt_1915_3)
})
