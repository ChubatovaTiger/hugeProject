package subProj_170

import subProj_170.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_170")
    name = "subProj 170"

    buildType(subProj_bt_170_3)
    buildType(subProj_bt_170_2)
    buildType(subProj_bt_170_5)
    buildType(subProj_bt_170_4)
    buildType(subProj_bt_170_1)
    buildType(subProj_bt_170_0)
})
