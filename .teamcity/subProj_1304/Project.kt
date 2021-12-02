package subProj_1304

import subProj_1304.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1304")
    name = "subProj 1304"

    buildType(subProj_bt_1304_5)
    buildType(subProj_bt_1304_4)
    buildType(subProj_bt_1304_1)
    buildType(subProj_bt_1304_0)
    buildType(subProj_bt_1304_3)
    buildType(subProj_bt_1304_2)
})
