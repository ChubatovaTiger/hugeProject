package subProj_856

import subProj_856.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_856")
    name = "subProj 856"

    buildType(subProj_bt_856_5)
    buildType(subProj_bt_856_4)
    buildType(subProj_bt_856_3)
    buildType(subProj_bt_856_2)
    buildType(subProj_bt_856_1)
    buildType(subProj_bt_856_0)
})
