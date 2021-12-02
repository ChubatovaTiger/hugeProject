package subProj_1037

import subProj_1037.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1037")
    name = "subProj 1037"

    buildType(subProj_bt_1037_3)
    buildType(subProj_bt_1037_4)
    buildType(subProj_bt_1037_5)
    buildType(subProj_bt_1037_0)
    buildType(subProj_bt_1037_1)
    buildType(subProj_bt_1037_2)
})
