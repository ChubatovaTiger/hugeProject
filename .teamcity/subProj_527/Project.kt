package subProj_527

import subProj_527.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_527")
    name = "subProj 527"

    buildType(subProj_bt_527_5)
    buildType(subProj_bt_527_4)
    buildType(subProj_bt_527_3)
    buildType(subProj_bt_527_2)
    buildType(subProj_bt_527_1)
    buildType(subProj_bt_527_0)
})
