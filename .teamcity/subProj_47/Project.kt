package subProj_47

import subProj_47.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_47")
    name = "subProj 47"

    buildType(subProj_bt_47_0)
    buildType(subProj_bt_47_2)
    buildType(subProj_bt_47_1)
    buildType(subProj_bt_47_4)
    buildType(subProj_bt_47_3)
    buildType(subProj_bt_47_5)
})
