package subProj_40

import subProj_40.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_40")
    name = "subProj 40"

    buildType(subProj_bt_40_1)
    buildType(subProj_bt_40_0)
    buildType(subProj_bt_40_3)
    buildType(subProj_bt_40_2)
    buildType(subProj_bt_40_5)
    buildType(subProj_bt_40_4)
})
