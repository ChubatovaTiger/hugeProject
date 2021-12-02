package subProj_1865

import subProj_1865.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1865")
    name = "subProj 1865"

    buildType(subProj_bt_1865_2)
    buildType(subProj_bt_1865_3)
    buildType(subProj_bt_1865_0)
    buildType(subProj_bt_1865_1)
    buildType(subProj_bt_1865_4)
    buildType(subProj_bt_1865_5)
})
