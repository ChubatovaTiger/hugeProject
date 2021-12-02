package subProj_929

import subProj_929.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_929")
    name = "subProj 929"

    buildType(subProj_bt_929_5)
    buildType(subProj_bt_929_4)
    buildType(subProj_bt_929_3)
    buildType(subProj_bt_929_2)
    buildType(subProj_bt_929_1)
    buildType(subProj_bt_929_0)
})
