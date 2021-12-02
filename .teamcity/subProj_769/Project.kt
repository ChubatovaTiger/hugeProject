package subProj_769

import subProj_769.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_769")
    name = "subProj 769"

    buildType(subProj_bt_769_3)
    buildType(subProj_bt_769_2)
    buildType(subProj_bt_769_5)
    buildType(subProj_bt_769_4)
    buildType(subProj_bt_769_1)
    buildType(subProj_bt_769_0)
})
