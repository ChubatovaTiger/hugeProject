package subProj_1343

import subProj_1343.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1343")
    name = "subProj 1343"

    buildType(subProj_bt_1343_0)
    buildType(subProj_bt_1343_5)
    buildType(subProj_bt_1343_4)
    buildType(subProj_bt_1343_3)
    buildType(subProj_bt_1343_2)
    buildType(subProj_bt_1343_1)
})
