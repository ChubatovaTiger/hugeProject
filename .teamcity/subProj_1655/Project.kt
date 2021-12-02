package subProj_1655

import subProj_1655.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1655")
    name = "subProj 1655"

    buildType(subProj_bt_1655_5)
    buildType(subProj_bt_1655_0)
    buildType(subProj_bt_1655_2)
    buildType(subProj_bt_1655_1)
    buildType(subProj_bt_1655_4)
    buildType(subProj_bt_1655_3)
})
