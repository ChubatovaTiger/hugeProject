package subProj_1769

import subProj_1769.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1769")
    name = "subProj 1769"

    buildType(subProj_bt_1769_1)
    buildType(subProj_bt_1769_2)
    buildType(subProj_bt_1769_3)
    buildType(subProj_bt_1769_4)
    buildType(subProj_bt_1769_5)
    buildType(subProj_bt_1769_0)
})
