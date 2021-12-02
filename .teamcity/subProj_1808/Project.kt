package subProj_1808

import subProj_1808.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1808")
    name = "subProj 1808"

    buildType(subProj_bt_1808_5)
    buildType(subProj_bt_1808_4)
    buildType(subProj_bt_1808_3)
    buildType(subProj_bt_1808_2)
    buildType(subProj_bt_1808_1)
    buildType(subProj_bt_1808_0)
})
