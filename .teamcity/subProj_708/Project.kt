package subProj_708

import subProj_708.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_708")
    name = "subProj 708"

    buildType(subProj_bt_708_0)
    buildType(subProj_bt_708_3)
    buildType(subProj_bt_708_4)
    buildType(subProj_bt_708_1)
    buildType(subProj_bt_708_2)
    buildType(subProj_bt_708_5)
})
