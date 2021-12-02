package subProj_17

import subProj_17.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_17")
    name = "subProj 17"

    buildType(subProj_bt_17_3)
    buildType(subProj_bt_17_2)
    buildType(subProj_bt_17_1)
    buildType(subProj_bt_17_0)
    buildType(subProj_bt_17_5)
    buildType(subProj_bt_17_4)
})
