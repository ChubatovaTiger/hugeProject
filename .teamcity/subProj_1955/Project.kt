package subProj_1955

import subProj_1955.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1955")
    name = "subProj 1955"

    buildType(subProj_bt_1955_0)
    buildType(subProj_bt_1955_1)
    buildType(subProj_bt_1955_2)
    buildType(subProj_bt_1955_3)
    buildType(subProj_bt_1955_4)
    buildType(subProj_bt_1955_5)
})
