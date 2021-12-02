package subProj_905

import subProj_905.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_905")
    name = "subProj 905"

    buildType(subProj_bt_905_4)
    buildType(subProj_bt_905_5)
    buildType(subProj_bt_905_2)
    buildType(subProj_bt_905_3)
    buildType(subProj_bt_905_0)
    buildType(subProj_bt_905_1)
})
