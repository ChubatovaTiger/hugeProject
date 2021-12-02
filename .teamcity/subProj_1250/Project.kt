package subProj_1250

import subProj_1250.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1250")
    name = "subProj 1250"

    buildType(subProj_bt_1250_1)
    buildType(subProj_bt_1250_0)
    buildType(subProj_bt_1250_3)
    buildType(subProj_bt_1250_2)
    buildType(subProj_bt_1250_5)
    buildType(subProj_bt_1250_4)
})
