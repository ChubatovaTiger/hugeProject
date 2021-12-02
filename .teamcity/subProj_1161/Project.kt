package subProj_1161

import subProj_1161.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1161")
    name = "subProj 1161"

    buildType(subProj_bt_1161_2)
    buildType(subProj_bt_1161_1)
    buildType(subProj_bt_1161_0)
    buildType(subProj_bt_1161_5)
    buildType(subProj_bt_1161_4)
    buildType(subProj_bt_1161_3)
})
