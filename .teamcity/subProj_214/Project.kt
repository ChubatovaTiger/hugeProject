package subProj_214

import subProj_214.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_214")
    name = "subProj 214"

    buildType(subProj_bt_214_3)
    buildType(subProj_bt_214_4)
    buildType(subProj_bt_214_5)
    buildType(subProj_bt_214_0)
    buildType(subProj_bt_214_1)
    buildType(subProj_bt_214_2)
})
