package subProj_1778

import subProj_1778.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1778")
    name = "subProj 1778"

    buildType(subProj_bt_1778_3)
    buildType(subProj_bt_1778_4)
    buildType(subProj_bt_1778_5)
    buildType(subProj_bt_1778_0)
    buildType(subProj_bt_1778_1)
    buildType(subProj_bt_1778_2)
})
