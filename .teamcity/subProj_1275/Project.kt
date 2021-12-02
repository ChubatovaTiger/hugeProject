package subProj_1275

import subProj_1275.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1275")
    name = "subProj 1275"

    buildType(subProj_bt_1275_5)
    buildType(subProj_bt_1275_3)
    buildType(subProj_bt_1275_4)
    buildType(subProj_bt_1275_1)
    buildType(subProj_bt_1275_2)
    buildType(subProj_bt_1275_0)
})
