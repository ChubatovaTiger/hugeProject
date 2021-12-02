package subProj_88

import subProj_88.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_88")
    name = "subProj 88"

    buildType(subProj_bt_88_0)
    buildType(subProj_bt_88_1)
    buildType(subProj_bt_88_4)
    buildType(subProj_bt_88_5)
    buildType(subProj_bt_88_2)
    buildType(subProj_bt_88_3)
})
