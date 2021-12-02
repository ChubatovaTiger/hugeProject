package subProj_1027

import subProj_1027.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1027")
    name = "subProj 1027"

    buildType(subProj_bt_1027_1)
    buildType(subProj_bt_1027_0)
    buildType(subProj_bt_1027_5)
    buildType(subProj_bt_1027_4)
    buildType(subProj_bt_1027_3)
    buildType(subProj_bt_1027_2)
})
