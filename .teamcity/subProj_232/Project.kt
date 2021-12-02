package subProj_232

import subProj_232.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_232")
    name = "subProj 232"

    buildType(subProj_bt_232_4)
    buildType(subProj_bt_232_3)
    buildType(subProj_bt_232_5)
    buildType(subProj_bt_232_0)
    buildType(subProj_bt_232_2)
    buildType(subProj_bt_232_1)
})
