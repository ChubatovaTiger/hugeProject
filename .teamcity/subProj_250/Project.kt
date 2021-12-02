package subProj_250

import subProj_250.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_250")
    name = "subProj 250"

    buildType(subProj_bt_250_5)
    buildType(subProj_bt_250_3)
    buildType(subProj_bt_250_4)
    buildType(subProj_bt_250_1)
    buildType(subProj_bt_250_2)
    buildType(subProj_bt_250_0)
})
