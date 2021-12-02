package subProj_1980

import subProj_1980.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1980")
    name = "subProj 1980"

    buildType(subProj_bt_1980_3)
    buildType(subProj_bt_1980_2)
    buildType(subProj_bt_1980_5)
    buildType(subProj_bt_1980_4)
    buildType(subProj_bt_1980_1)
    buildType(subProj_bt_1980_0)
})
