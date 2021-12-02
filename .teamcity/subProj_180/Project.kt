package subProj_180

import subProj_180.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_180")
    name = "subProj 180"

    buildType(subProj_bt_180_4)
    buildType(subProj_bt_180_3)
    buildType(subProj_bt_180_5)
    buildType(subProj_bt_180_0)
    buildType(subProj_bt_180_2)
    buildType(subProj_bt_180_1)
})
