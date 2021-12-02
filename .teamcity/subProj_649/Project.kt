package subProj_649

import subProj_649.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_649")
    name = "subProj 649"

    buildType(subProj_bt_649_5)
    buildType(subProj_bt_649_3)
    buildType(subProj_bt_649_4)
    buildType(subProj_bt_649_1)
    buildType(subProj_bt_649_2)
    buildType(subProj_bt_649_0)
})
