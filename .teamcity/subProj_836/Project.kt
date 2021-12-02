package subProj_836

import subProj_836.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_836")
    name = "subProj 836"

    buildType(subProj_bt_836_3)
    buildType(subProj_bt_836_4)
    buildType(subProj_bt_836_1)
    buildType(subProj_bt_836_2)
    buildType(subProj_bt_836_5)
    buildType(subProj_bt_836_0)
})
