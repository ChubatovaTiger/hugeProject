package subProj_738

import subProj_738.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_738")
    name = "subProj 738"

    buildType(subProj_bt_738_4)
    buildType(subProj_bt_738_5)
    buildType(subProj_bt_738_0)
    buildType(subProj_bt_738_1)
    buildType(subProj_bt_738_2)
    buildType(subProj_bt_738_3)
})
