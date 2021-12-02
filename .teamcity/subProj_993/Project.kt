package subProj_993

import subProj_993.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_993")
    name = "subProj 993"

    buildType(subProj_bt_993_0)
    buildType(subProj_bt_993_3)
    buildType(subProj_bt_993_4)
    buildType(subProj_bt_993_1)
    buildType(subProj_bt_993_2)
    buildType(subProj_bt_993_5)
})
