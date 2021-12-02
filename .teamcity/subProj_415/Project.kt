package subProj_415

import subProj_415.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_415")
    name = "subProj 415"

    buildType(subProj_bt_415_0)
    buildType(subProj_bt_415_1)
    buildType(subProj_bt_415_2)
    buildType(subProj_bt_415_3)
    buildType(subProj_bt_415_4)
    buildType(subProj_bt_415_5)
})
