package subProj_275

import subProj_275.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_275")
    name = "subProj 275"

    buildType(subProj_bt_275_5)
    buildType(subProj_bt_275_4)
    buildType(subProj_bt_275_3)
    buildType(subProj_bt_275_2)
    buildType(subProj_bt_275_1)
    buildType(subProj_bt_275_0)
})
