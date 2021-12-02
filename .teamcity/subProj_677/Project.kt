package subProj_677

import subProj_677.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_677")
    name = "subProj 677"

    buildType(subProj_bt_677_5)
    buildType(subProj_bt_677_4)
    buildType(subProj_bt_677_3)
    buildType(subProj_bt_677_2)
    buildType(subProj_bt_677_1)
    buildType(subProj_bt_677_0)
})
