package subProj_387

import subProj_387.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_387")
    name = "subProj 387"

    buildType(subProj_bt_387_3)
    buildType(subProj_bt_387_2)
    buildType(subProj_bt_387_5)
    buildType(subProj_bt_387_4)
    buildType(subProj_bt_387_1)
    buildType(subProj_bt_387_0)
})
