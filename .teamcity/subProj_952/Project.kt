package subProj_952

import subProj_952.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_952")
    name = "subProj 952"

    buildType(subProj_bt_952_1)
    buildType(subProj_bt_952_0)
    buildType(subProj_bt_952_3)
    buildType(subProj_bt_952_2)
    buildType(subProj_bt_952_5)
    buildType(subProj_bt_952_4)
})
