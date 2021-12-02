package subProj_900

import subProj_900.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_900")
    name = "subProj 900"

    buildType(subProj_bt_900_1)
    buildType(subProj_bt_900_2)
    buildType(subProj_bt_900_0)
    buildType(subProj_bt_900_5)
    buildType(subProj_bt_900_3)
    buildType(subProj_bt_900_4)
})
