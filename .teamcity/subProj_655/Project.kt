package subProj_655

import subProj_655.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_655")
    name = "subProj 655"

    buildType(subProj_bt_655_4)
    buildType(subProj_bt_655_5)
    buildType(subProj_bt_655_2)
    buildType(subProj_bt_655_3)
    buildType(subProj_bt_655_0)
    buildType(subProj_bt_655_1)
})
