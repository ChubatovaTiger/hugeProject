package subProj_134

import subProj_134.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_134")
    name = "subProj 134"

    buildType(subProj_bt_134_5)
    buildType(subProj_bt_134_4)
    buildType(subProj_bt_134_3)
    buildType(subProj_bt_134_2)
    buildType(subProj_bt_134_1)
    buildType(subProj_bt_134_0)
})
