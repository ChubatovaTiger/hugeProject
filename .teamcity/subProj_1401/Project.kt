package subProj_1401

import subProj_1401.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1401")
    name = "subProj 1401"

    buildType(subProj_bt_1401_1)
    buildType(subProj_bt_1401_0)
    buildType(subProj_bt_1401_5)
    buildType(subProj_bt_1401_4)
    buildType(subProj_bt_1401_3)
    buildType(subProj_bt_1401_2)
})
