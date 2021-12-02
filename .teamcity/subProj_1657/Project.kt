package subProj_1657

import subProj_1657.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1657")
    name = "subProj 1657"

    buildType(subProj_bt_1657_4)
    buildType(subProj_bt_1657_3)
    buildType(subProj_bt_1657_5)
    buildType(subProj_bt_1657_0)
    buildType(subProj_bt_1657_2)
    buildType(subProj_bt_1657_1)
})
