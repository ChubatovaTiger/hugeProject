package subProj_583

import subProj_583.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_583")
    name = "subProj 583"

    buildType(subProj_bt_583_4)
    buildType(subProj_bt_583_5)
    buildType(subProj_bt_583_2)
    buildType(subProj_bt_583_3)
    buildType(subProj_bt_583_0)
    buildType(subProj_bt_583_1)
})
