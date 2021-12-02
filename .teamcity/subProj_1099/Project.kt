package subProj_1099

import subProj_1099.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1099")
    name = "subProj 1099"

    buildType(subProj_bt_1099_5)
    buildType(subProj_bt_1099_4)
    buildType(subProj_bt_1099_3)
    buildType(subProj_bt_1099_2)
    buildType(subProj_bt_1099_1)
    buildType(subProj_bt_1099_0)
})
