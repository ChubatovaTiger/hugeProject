package subProj_1952

import subProj_1952.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1952")
    name = "subProj 1952"

    buildType(subProj_bt_1952_1)
    buildType(subProj_bt_1952_2)
    buildType(subProj_bt_1952_3)
    buildType(subProj_bt_1952_4)
    buildType(subProj_bt_1952_0)
    buildType(subProj_bt_1952_5)
})
