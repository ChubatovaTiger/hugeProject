package subProj_1416

import subProj_1416.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1416")
    name = "subProj 1416"

    buildType(subProj_bt_1416_5)
    buildType(subProj_bt_1416_4)
    buildType(subProj_bt_1416_3)
    buildType(subProj_bt_1416_2)
    buildType(subProj_bt_1416_1)
    buildType(subProj_bt_1416_0)
})
