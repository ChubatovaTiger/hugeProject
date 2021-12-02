package subProj_1527

import subProj_1527.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1527")
    name = "subProj 1527"

    buildType(subProj_bt_1527_3)
    buildType(subProj_bt_1527_4)
    buildType(subProj_bt_1527_1)
    buildType(subProj_bt_1527_2)
    buildType(subProj_bt_1527_5)
    buildType(subProj_bt_1527_0)
})
