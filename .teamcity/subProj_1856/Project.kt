package subProj_1856

import subProj_1856.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1856")
    name = "subProj 1856"

    buildType(subProj_bt_1856_1)
    buildType(subProj_bt_1856_0)
    buildType(subProj_bt_1856_3)
    buildType(subProj_bt_1856_2)
    buildType(subProj_bt_1856_5)
    buildType(subProj_bt_1856_4)
})
