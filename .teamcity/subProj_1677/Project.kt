package subProj_1677

import subProj_1677.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1677")
    name = "subProj 1677"

    buildType(subProj_bt_1677_5)
    buildType(subProj_bt_1677_0)
    buildType(subProj_bt_1677_3)
    buildType(subProj_bt_1677_4)
    buildType(subProj_bt_1677_1)
    buildType(subProj_bt_1677_2)
})
