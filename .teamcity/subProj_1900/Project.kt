package subProj_1900

import subProj_1900.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1900")
    name = "subProj 1900"

    buildType(subProj_bt_1900_1)
    buildType(subProj_bt_1900_0)
    buildType(subProj_bt_1900_3)
    buildType(subProj_bt_1900_2)
    buildType(subProj_bt_1900_5)
    buildType(subProj_bt_1900_4)
})
